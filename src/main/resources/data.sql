INSERT INTO employee(administrative_function, base_salary, developer_function, first_name, last_name, team_id)
    VALUES (1, 2000, 1, 'Marius', 'Ian', 1),
           (1, 1800, 2, 'Alin', 'Smith', 2),
           (null, 1500, 3, 'Mara', 'Smith', 3),
           (null, 1000, 4, 'Cleopatra', 'Smith', 4),
           (null, 1000, 2, 'Simina', 'Smith', 1);

INSERT INTO team(name) VALUES
                           ('Developer team'),
                           ('Testing team'),
                           ('HR team'),
                           ('Maintenance team');