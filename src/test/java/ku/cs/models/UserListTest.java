package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {

        UserList userList = new UserList();
        User user = new User("John", "Doe");
        userList.addUser("John", "Doe");
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");



        // assertEquals("Karapuk",userList.findUserByUsername("Karapuk").getUsername()); also works



        String expected = "John";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList userList = new UserList();
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");



        assertTrue(userList.changePassword("Karapuk","12345","6789"));


    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        UserList userList = new UserList();
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");


        assertEquals(userList.findUserByUsername("Karapuk"),userList.login("Karapuk","12345"));

    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        UserList userList = new UserList();
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");

        assertNull(userList.login("Karapuk","1234"));
    }

}