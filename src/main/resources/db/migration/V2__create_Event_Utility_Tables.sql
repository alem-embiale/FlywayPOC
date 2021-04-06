
CREATE TABLE Utility (
    id int primary key,
    code int
);

CREATE TABLE Event (
    id int primary key,
    utility_event_signal int,
    utility_id int,
    CONSTRAINT FK_UtilityId FOREIGN KEY (utility_id)
                   REFERENCES Utility(id)
)