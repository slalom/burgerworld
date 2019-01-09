CREATE KEYSPACE IF NOT EXISTS burger_world
  WITH REPLICATION = { 
   'class' : 'SimpleStrategy', 
   'replication_factor' : 1 
  };
  
  DROP TABLE IF EXISTS burger_world.items;
  
  CREATE TABLE IF NOT EXISTS burger_world.item (
   id text PRIMARY KEY, 
   name text, 
   price double
  );
  
/*
  INSERT INTO burger_world.item (id, name, price) VALUES ('nameid', 'name', 1980000);
  SELECT * FROM burger_world.item;
*/