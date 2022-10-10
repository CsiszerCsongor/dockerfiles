# dockerfiles
References:
https://relentlesscoding.com/posts/oracle-sqlplus-in-a-small-docker-container/
https://github.com/oracle/docker-images/blob/main/OracleInstantClient/oraclelinux7/19/Dockerfile

###### Build image:
	docker build -t sqlplus . 

###### Create container:
	docker run -ti --rm sqlplus sqlplus /bin/bash

###### Connect to database:	
	sqlplus <user>/<pass>@<IP>/<SID>