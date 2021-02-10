/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOs;

import utils.IConstants;

/**
 *
 * @author samdo
 */
public class RegisteredUser extends User{
    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
        private String userType;

    public RegisteredUser(long id, String email, String password, String firstName, String lastName) { //String userType
        super(id,email,password,firstName,lastName);
        this.userType = IConstants.USER_TYPE_GENERAL_USER;
                //this.userType = userType;

    }
    
}
