package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void testPunchTimeCard() {
        Employee employee = new Employee(1, "Lazy Susan", "Food", 15.0);
        employee.punchIn(9.0);
        employee.punchOut(17.0);
        assertEquals(8.0, employee.getHoursWorked(), 0.0001);
    }
}