package Clases;

public class AppGlobalState {
    
    public UserModel currentUser;
    
   public void setCurrentUser(UserModel currentUser) {
        this.currentUser = currentUser;
    }
    
    public UserModel getCurrentUser() {
        return currentUser;
    }
    
    public boolean isUserLoggedIn() {
        return currentUser != null;
    }
    
    public void logout() {
        currentUser = null;
    }

}
