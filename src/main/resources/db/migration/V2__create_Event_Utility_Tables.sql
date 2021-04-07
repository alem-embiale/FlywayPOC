
CREATE TABLE Utility (
    id int primary key,
    code int
);

CREATE TABLE Event (
    id int primary key,
    utility_event_signal int,
    utility_id int
)

CREATE UNIQUE index UQ_Event__utilityId_utilitySignal On Event(utility_id, utility_event_signal)