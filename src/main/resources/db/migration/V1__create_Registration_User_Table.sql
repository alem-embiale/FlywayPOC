USE SmartGrid;
GO

CREATE TABLE Registration_User (
    id int primary key,
    user_name varchar(255) NOT NULL,
    first_name varchar(255) NOT NULL
);
GO