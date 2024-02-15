# CREATE TABLE departments
# (
#     id INT PRIMARY KEY,
#     department_name VARCHAR(255) NOT NULL
# );
#
# CREATE TABLE employees
# (
#     id            INT PRIMARY KEY,
#     name          VARCHAR(255) NOT NULL,
#     sur_name      VARCHAR(255),
#     email         VARCHAR(255),
#     phone_number  VARCHAR(255),
#     salary        FLOAT,
#     position      VARCHAR(255),
#     department_id INT,
#
#     FOREIGN KEY (department_id) REFERENCES departments (id)
# );
# #
# # INSERT INTO departments (id, department_name)
# # VALUES
# #     (1, 'IT'),(2, 'HR'), (2, 'HR');
# #
# # INSERT INTO employees (id, name, sur_name, email, phone_number, salary, position, department_id)
# # VALUES (1, 'John', 'Doe', 'john.doe@example.com', '1234567890', 50000, 'MANAGER', 1);
# #
# # INSERT INTO employees (id, name, sur_name, email, phone_number, salary, position, department_id)
# # VALUES (2, 'Jane', 'Doe', 'jane.doe@example.com', '0987654321', 40000, 'LEAD', 1);
# #
# # INSERT INTO employees (id, name, sur_name, email, phone_number, salary, position, department_id)
# # VALUES (3, 'Max', 'Mustermann', 'max.mustermann@example.com', '1122334455', 30000, 'DEVELOPER', 3);
# #
# # INSERT INTO employees (id, name, sur_name, email, phone_number, salary, position, department_id)
# # VALUES (4, 'Erika', 'Mustermann', 'erika.mustermann@example.com', '5544332211', 35000, 'HR_SPECIALIST', 3);
# #
# # INSERT INTO employees (id, name, sur_name, email, phone_number, salary, position, department_id)
# # VALUES (5, 'Sandra', 'Musterfrau', 'sandra.musterfrau@example.com', '9988776655', 45000, 'FINANCE_MANAGER', 2);