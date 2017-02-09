/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbudgettracker;

import java.util.ArrayList;

/**
 *
 * @author glorykim
 */
public class User {
    
    String userName, password, firstName, lastName;
    ArrayList<Transaction> userTransactionList;
    
    User()
    {
        userTransactionList = new ArrayList<Transaction>();    
    }
    
    User(String userName, String password, String firstName, String LastName)
    {
        this();
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public int createNewUser(User newUser)
    {
        
        //Insert User details into Database
        //IF DB insert is successful return 0
        //Else, return -1
        return 0;
    }
    
    public void addNewTransaction(Transaction newTransaction)
    {
        
        userTransactionList.add(newTransaction);
        //Add this transaction into DB
    }
    
    public void addUserToDB(User c)
    {
        
    }
    
    public static User getUserFromDB(String userName)
    {
        //Fetch data and create user object and return to calling function
        User user = new User("Name","Password","FirstName","LastName");
        return user;
    }
    
    public ArrayList<Transaction> getUserTransactions()
    {
        ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
        Transaction t1 = new Transaction("Cat1", "desc1", "02/2/2017", 100);
        Transaction t2 = new Transaction("Cat2", "desc2", "02/2/2017", 1000);
        transactionList.add(t1);
        transactionList.add(t2);
        //Populate above list from DB and return
        return transactionList;
    }
}
