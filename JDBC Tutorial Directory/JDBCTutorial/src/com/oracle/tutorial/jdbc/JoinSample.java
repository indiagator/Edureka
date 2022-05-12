/*
 * Copyright (c) 1995, 2020, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oracle.tutorial.jdbc;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JoinSample {
  
  Connection con;
  JDBCTutorialUtilities settings;  
  
  public JoinSample(Connection connArg, JDBCTutorialUtilities settingsArg) {
    this.con = connArg;
    this.settings = settingsArg;
  }

  public static void getCoffeesBoughtBySupplier(String supplierName,
                                                Connection con) throws SQLException {
    String query = "SELECT COFFEES.COF_NAME FROM COFFEES, SUPPLIERS " +
      "WHERE SUPPLIERS.SUP_NAME LIKE ? and SUPPLIERS.SUP_ID = COFFEES.SUP_ID";

    try (PreparedStatement ps = con.prepareStatement(query)) {
      ps.setString(1, supplierName);
      ResultSet rs = ps.executeQuery();
      System.out.println("Coffees bought from " + supplierName + ": ");
      while (rs.next()) {
        String coffeeName = rs.getString(1);
        System.out.println("     " + coffeeName);
      }
    } catch (SQLException e) {
      JDBCTutorialUtilities.printSQLException(e);
    } 
  }
  
  public void testJoinRowSet(String supplierName) throws SQLException {
    RowSetFactory factory = RowSetProvider.newFactory();  
    try (CachedRowSet coffees = factory.createCachedRowSet();
         CachedRowSet suppliers = factory.createCachedRowSet();
         JoinRowSet jrs = factory.createJoinRowSet()) {
      coffees.setCommand("SELECT * FROM COFFEES");
      coffees.setUsername(settings.userName);
      coffees.setPassword(settings.password);
      coffees.setUrl(settings.urlString);
      coffees.execute();
      
      suppliers.setCommand("SELECT * FROM SUPPLIERS");
      suppliers.setUsername(settings.userName);
      suppliers.setPassword(settings.password);
      suppliers.setUrl(settings.urlString);
      suppliers.execute();      

      jrs.addRowSet(coffees, "SUP_ID");
      jrs.addRowSet(suppliers, "SUP_ID");
      
      System.out.println("Coffees bought from " + supplierName + ": ");
      while (jrs.next()) {
        if (jrs.getString("SUP_NAME").equals(supplierName)) { 
          String coffeeName = jrs.getString(1);
          System.out.println("     " + coffeeName);
        }
      }
    } catch (SQLException e) {
      JDBCTutorialUtilities.printSQLException(e);
    }
  }


  public static void main(String[] args) {
    JDBCTutorialUtilities myJDBCTutorialUtilities;
    Connection myConnection = null;
    if (args[0] == null) {
      System.err.println("Properties file not specified at command line");
      return;
    } else {
      try {
        myJDBCTutorialUtilities = new JDBCTutorialUtilities(args[0]);
      } catch (Exception e) {
        System.err.println("Problem reading properties file " + args[0]);
        e.printStackTrace();
        return;
      }
    }

    try {
      myConnection = myJDBCTutorialUtilities.getConnection();

      System.out.println("\nCoffees bought by each supplier:");
      JoinSample.getCoffeesBoughtBySupplier("Acme, Inc.", myConnection);

      System.out.println("\nUsing JoinRowSet:");
      JoinSample myJoinSample = new JoinSample(myConnection, myJDBCTutorialUtilities);
      myJoinSample.testJoinRowSet("Acme, Inc.");

    } catch (SQLException e) {
      JDBCTutorialUtilities.printSQLException(e);
    } finally {
      JDBCTutorialUtilities.closeConnection(myConnection);
    }
  }
}
