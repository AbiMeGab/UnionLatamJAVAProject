package Clases;

public class AppGlobalState {
    
    private UserModel currentUser = null;
    final private UserStorageMock userStorage = new UserStorageMock();
    
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
    
    public UserStorageMock getUserStorage() {
        return userStorage;
    }
    

}
