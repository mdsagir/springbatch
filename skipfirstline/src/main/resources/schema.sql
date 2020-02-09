DROP TABLE IF EXISTS employee;

CREATE TABLE employee  (
    employeeId VARCHAR(40)  NOT NULL PRIMARY KEY,
    firstName VARCHAR(40),
    lastName VARCHAR(40),
    email VARCHAR(100),
    age INT

);
