# burgerworld
Simple POS System using SpringBoot, Cassandra, Kafka


### Q&A
*Application is not starting, error with Tomcat context*

1) Ensure the networking for the IDE allows connectivity (no firewall or restrictions)
2) Make sure Casssandra is running in Docker on port 9042. `
docker run -p 9042:9042 --name cassandra -d cassandra
`
You may also want to initialize the table with the correct schema (see `db_src` folder)

