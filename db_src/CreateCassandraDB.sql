CREATE KEYSPACE IF NOT EXISTS burger_world
  WITH REPLICATION = { 
   'class' : 'SimpleStrategy', 
   'replication_factor' : 1 
  };
  
  DROP TABLE IF EXISTS burger_world.item;
  
  CREATE TABLE IF NOT EXISTS burger_world.item (
   id text PRIMARY KEY, 
   name text, 
   price double
  );
  
    CREATE TABLE IF NOT EXISTS burger_world.orders (
   id text PRIMARY KEY, 
   poNumber text, 
   customerName text,
   orderDate DATE
  );
  
  CREATE TABLE IF NOT EXISTS burger_world.orderlineitem (
   id text PRIMARY KEY, 
   name text, 
   price DOUBLE,
   quantity INT
  );
  
/*
  INSERT INTO burger_world.item (id, name, price) VALUES ('nameid', 'name', 1980000);
  SELECT * FROM burger_world.item;
  
  SELECT * FROM burger_world.orders
  
  SELECT * FROM burger_world.orderlineitem
*/