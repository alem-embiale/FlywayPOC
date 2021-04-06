
CREATE TABLE Utility (
    id int primary key,
    code int NOT NULL
);

CREATE TABLE Event (
    id int primary key,
    utility_event_signal int not null
    utility_id int,
    CONSTRAINT FK_UtilityId FOREIGN KEY (utility_id)
                   REFERENCES Utility(id)
)