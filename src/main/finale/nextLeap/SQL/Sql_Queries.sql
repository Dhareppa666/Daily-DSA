
Basics:

SELECT * FROM Products WHERE Price <> 18;

SELECT * FROM Products WHERE Price BETWEEN 50 AND 60;

SELECT * FROM Customers WHERE City IN ('Paris','London');

SELECT CustomerName, ContactName, Address FROM Customers WHERE Address IS NOT NULL;

SELECT tweet_id from Tweets where LENGTH(content) > 15  // returns the length of the string measured in bytes.
SELECT tweet_id from Tweets where CHAR_LENGTH(content) > 15  // returns the length of the string measured in characters.

Easy:

SELECT DISTINCT author_id as id FROM Views Where author_id = viewer_id ORDER BY id;

SELECT e2.unique_id AS unique_id, e1.name AS name
FROM Employees as e1
LEFT JOIN EmployeeUNI as e2
ON e2.id=e1.id;  // USING(id)


