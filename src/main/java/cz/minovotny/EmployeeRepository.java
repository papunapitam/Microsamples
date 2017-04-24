package cz.minovotny;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xnovm on 19.03.2017.
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
