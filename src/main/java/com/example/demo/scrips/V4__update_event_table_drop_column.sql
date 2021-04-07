DROP index UQ_Event__utilityId_utilitySignal On Event;
ALTER TABLE Event DROP COLUMN utility_id;
CREATE UNIQUE index UQ_Event__utilityCode_utilitySignal On Event(utility_code, utility_event_signal)