CREATE KEYSPACE IF NOT EXISTS burger_world
  WITH REPLICATION = { 
   'class' : 'SimpleStrategy', 
   'replication_factor' : 1 
  };
  
  DROP TABLE IF EXISTS burger_world.item;
  
 DROP TABLE IF EXISTS burger_world.orders;
  
  CREATE TABLE IF NOT EXISTS burger_world.item (
   id text PRIMARY KEY, 
   name text, 
   price double,
   imageFileName text
  );
  
    CREATE TABLE IF NOT EXISTS burger_world.productorder (
   id text PRIMARY KEY, 
   poNumber text, 
   customerName text,
   orderDate timestamp
  );
  
  CREATE TABLE IF NOT EXISTS burger_world.orderlineitem (
   id text PRIMARY KEY, 
   name text, 
   price DOUBLE,
   quantity INT
  );
  
  
    INSERT INTO burger_world.productorder (id, poNumber, customerName, orderDate) VALUES ('order123', 'po1234', 'Nathaniel Davis Jr.', '2019-01-19');
  
  INSERT INTO burger_world.item (id, name, price, imagefilename) VALUES ('id1', 'Burger 1', 7.99, 'burger-1.png');
   INSERT INTO burger_world.item (id, name, price, imagefilename) VALUES ('id2', 'Soda Pop 1', 2.99, 'soda-pop-1.png');
   INSERT INTO burger_world.item (id, name, price, imagefilename) VALUES ('id3', 'French Fries 1', 4.99, 'french-fries-1.jpg');
  
  SELECT * FROM burger_world.item;
  
  
  SELECT * FROM burger_world.productorder;
  
  
  SELECT * FROM burger_world.orderlineitem
