CREATE KEYSPACE IF NOT EXISTS burger_world
  WITH REPLICATION = { 
   'class' : 'SimpleStrategy', 
   'replication_factor' : 1 
  };
  
  DROP TABLE IF EXISTS burger_world.items;
  
  CREATE TABLE IF NOT EXISTS burger_world.items (
   id text PRIMARY KEY, 
   name text, 
   price double
  );
  
/*
  INSERT INTO burger_world.items (id, name, price) VALUES ('nate id', 'nate', 1000000);
  SELECT * FROM burger_world.items;
*/