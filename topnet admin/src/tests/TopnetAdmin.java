/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import entities.user;
import services.UserCRUD;

/**
 *
 * @author DELL
 */
public class TopnetAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        user mehdi= new user();
        UserCRUD uc = new UserCRUD();
        mehdi.setFirstName("mehdi");
        uc.editUserRole(2, "admin");


    }
    
}
