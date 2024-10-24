# dockerfiles
References:
https://relentlesscoding.com/posts/oracle-sqlplus-in-a-small-docker-container/
https://github.com/oracle/docker-images/blob/main/OracleInstantClient/oraclelinux7/19/Dockerfile

###### Build image:
	docker build -t sqlplus . 

###### Build image with different dockerfile file name:
    docker build -t sqlplus -f DifferentDockerfileName .

###### Create container:
	docker run -ti --rm sqlplus /bin/bash

###### Connect to database:	
	sqlplus <user>/<pass>@<IP>/<SID>

###### Push image to custom docker repository
    docker build -t [registryhost]/[repository]/[image_name] -f [dockerfile_file_name] .
    docker push [previously_created_image]