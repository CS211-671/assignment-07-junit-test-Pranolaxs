package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {

        UserList userList = new UserList();
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");



        assertEquals("Karapuk",userList.findUserByUsername("Karapuk").getUsername());


        // TODO: add 3 users to UserList

        // TODO: find one of them

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList userList = new UserList();
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");



        assertTrue(userList.changePassword("Karapuk","12345","6789"));

        // TODO: add 3 users to UserList

        // TODO: change password of one user

        // TODO: assert that user can change password
        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        UserList userList = new UserList();
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");


        assertEquals(userList.findUserByUsername("Karapuk"),userList.login("Karapuk","12345"));
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        UserList userList = new UserList();
        userList.addUser("Karapuk","12345");
        userList.addUser("Chaiyong","78910");
        userList.addUser("Chakkra","224466");
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
        assertNull(userList.login("Karapuk","1234"));
    }

}