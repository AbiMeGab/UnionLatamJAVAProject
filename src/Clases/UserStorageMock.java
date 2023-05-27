package Clases;

import java.util.Stack;

interface UserStorage {
    void saveUser(UserModel user);

    void removeUserById(String id);

    UserModel getUserById(String id);

    UserModel getUserByEmail(String email);
}


public class UserStorageMock implements UserStorage {

    public Stack <UserModel> users = new Stack <UserModel>();

    public UserStorageMock() {

    }

    public void saveUser(UserModel user) {
        System.out.println("User saved with id [ " + user.getId() + " ]");
        users.push(user);
    }

    public UserModel getUserById(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void removeUserById(String id) {
        System.out.println("User removed with id [ " + id + " ]");
        users.removeIf(user -> user.getId().equals(id));
    }

    public UserModel getUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
    }

    public void printUsers() {
        System.out.println("Users:" + users.size());
        System.out.println("------");

        for (UserModel user : users) {
            System.out.println("User: " + user.getEmail());
        }
    }
    
    
    

}