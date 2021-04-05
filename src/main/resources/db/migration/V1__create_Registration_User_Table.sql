CREATE TABLE Utility (
    id int primary key,
    code int NOT NULL
);

CREATE TABLE Event (
    id int primary key,
    utility_event_signal int not null
)