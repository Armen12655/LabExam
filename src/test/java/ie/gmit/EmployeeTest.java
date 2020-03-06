package ie.gmit;

import org.junit.jupiter.api.*;

import static junit.framework.Assert.assertEquals;

public class EmployeeTest {
    private Employee myEmployee;

    @BeforeAll
    @DisplayName("Starting Test")
    public static void print() {
        System.out.println("Starting Test");
    }

    @BeforeEach
    @DisplayName("")
    void init(TestInfo testInfo, TestReporter testReporter) {
        myEmployee = new Employee();
        System.out.println("TimeStamp = " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Testing Name Getters and Setters")
    void testNAmeGettersAndSetters(TestInfo testInfo) {
        myEmployee.setName("armen");
        assertEquals(myEmployee.getName(), "armen");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setName("john");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setName("ghghghghghghghghghghghg");
        });
    }

    @Test
    @DisplayName("Testing EmploymentType Getters and Setters")
    void testEmploymentTypeGettersAndSetters(TestInfo testInfo) {
        myEmployee.setEmploymentType("fullTime");
        assertEquals(myEmployee.getEmploymentType(), "fullTime");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setEmploymentType("blah");
        });
    }

    @Test
    @DisplayName("Testing Title Setter and Getter")
    void testTitleInvalid(TestInfo testInfo) {
        myEmployee.setTitle("Mr");
        assertEquals(myEmployee.getTitle(), "Mr");
        myEmployee.setTitle("Mrs");
        assertEquals(myEmployee.getTitle(), "Mrs");
        myEmployee.setTitle("Miss");
        assertEquals(myEmployee.getTitle(), "Miss");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setTitle("ms");
        });
    }


    @Test
    @DisplayName("Testing PpsNumber Getter and Setter")
    void testLengthPpsNumberInvalid(TestInfo testInfo) {
        myEmployee.setPpsNumber("931198");
        assertEquals(myEmployee.getPpsNumber(), "931198");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setPpsNumber("7773654A");
        });
    }

    @Test
    @DisplayName("Testing Age Getter and Setter")
    void testLengthAgeInvalid(TestInfo testInfo) {
        myEmployee.setAge(19);
        assertEquals(myEmployee.getAge(), 19);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setAge(16);
        });
    }

    @Test
    @DisplayName("Testing Phone Getter and Setter")
    void testLengthPhoneInvalid(TestInfo testInfo) {
        myEmployee.setPhone("0876268");
        assertEquals(myEmployee.getPhone(), "0876268");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setPhone("087626");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            myEmployee.setPhone("08762667676");
        });
    }

    @Test
    @DisplayName("Invalid Constructor (title)")
    void testInvalidConstructedTitle(TestInfo testInfo) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee("rs", "armen", "123456", "1234567", "fullTime", 18);
        });
    }

    @Test
    @DisplayName("Invalid Constructor (name)")
    void testInvalidConstructedName(TestInfo testInfo) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee("mrs", "john", "123456", "1234567", "fullTime", 18);
        });
    }

    @Test
    @DisplayName("Invalid Constructor (PpsNumber)")
    void testInvalidConstructedPpsNumber(TestInfo testInfo) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee("mr", "armen", "1234567", "1234567", "fullTime", 18);
        });
    }

    @Test
    @DisplayName("Invalid Constructor (Phone)")
    void testInvalidConstructedPhone(TestInfo testInfo) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee("mr", "armen", "123456", "12345678", "fullTime", 18);
        });
    }

    @Test
    @DisplayName("Invalid Constructor (EmploymentType)")
    void testInvalidConstructedEmploymentType(TestInfo testInfo) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee("mr", "armen", "123456", "1234567", "full", 18);
        });
    }

    @Test
    @DisplayName("Invalid Constructor (Age)")
    void testInvalidConstructedAge(TestInfo testInfo) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Employee("Mr", "armen", "123456", "1234567", "fulltime", 16);
        });
    }

    @Test
    @DisplayName("valid Constructor")
    void testConstructedValid(TestInfo testInfo) {
        Employee employee1 = new Employee("mr", "armen", "123456", "1234567", "fullTime", 19);

        assertEquals("armen", employee1.getName());
        assertEquals("mr", employee1.getTitle());
        assertEquals("123456", employee1.getPpsNumber());
        assertEquals("1234567", employee1.getPhone());
        assertEquals("fullTime", employee1.getEmploymentType());
        assertEquals(19, employee1.getAge());
    }

    @AfterAll
    @DisplayName("Testing Complete")
    public static void done() {
        System.out.println("Testing Complete");
    }

}
