
Basics:

SELECT * FROM Products WHERE Price <> 18;

SELECT * FROM Products WHERE Price BETWEEN 50 AND 60;

SELECT * FROM Customers WHERE City IN ('Paris','London');

SELECT CustomerName, ContactName, Address FROM Customers WHERE Address IS NOT NULL;

Easy:

SELECT DISTINCT author_id as id from Views Where author_id = viewer_id ORDER BY id;

