SELECT * FROM staff;
SELECT * FROM teachingstaff;
SELECT * FROM nonteachingstaff;

SELECT staff.sid,sname,ts.qualification,ts.subjectexpertise,nonts.areaexpertise FROM staff
LEFT JOIN teachingstaff ts ON staff.sid=ts.sid
LEFT JOIN nonteachingstaff nonts ON staff.sid=nonts.sid;