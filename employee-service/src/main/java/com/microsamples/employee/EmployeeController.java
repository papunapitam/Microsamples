package com.microsamples.employee;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xnovm on 22.06.2017.
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {

//    @RequestMapping(method = RequestMethod.POST)
//    public create(@RequestBody Employee employee) {
//        return employeeRepository.save(employee);
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/{employeeId}")
    public Employee get(@PathVariable String employeeId) {
        Employee a = new Employee();
        a.setId("1");
        a.setEmail("john.wick@killer.com");
        a.setFullName("John Wick");
        a.setManagerEmail("none");

        return a;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Employee> getAll() {

        List<Employee> employees = new ArrayList<Employee>();

        Employee a = new Employee();
        a.setId("1");
        a.setEmail("john.wick@killer.com");
        a.setFullName("John Wick");
        a.setManagerEmail("none");

        Employee b = new Employee();
        b.setId("2");
        b.setEmail("super.mario@plumbing.com");
        b.setFullName("Super Mario");
        b.setManagerEmail("none");

        Employee c = new Employee();
        c.setId("3");
        c.setEmail("jessica.rabbit@disney.com");
        c.setFullName("Jessica Rabbit");
        c.setManagerEmail("none");

        employees.add(a);
        employees.add(b);
        employees.add(c);

        return employees;
    }
}
