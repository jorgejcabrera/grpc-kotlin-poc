# Grpc kotlin POC

### Requirements
- [X] Java 8
- [X] bloomrpc
- [X] gradle
- [X] docker

### Installation
BloomRPC is a client like Postman that allow you to querying your GRPC services.
Firstly, you need to install it with the following command (MAC):
```sh
$ brew install --cask bloomrpc
```
or
```sh
$ choco install bloomrpc
```
After that, select your protobuf files and start making requests

### Running
```sh
$ docker-compose up
```
or if you prefer you can run the grpc server locally with:
```sh
$ gradle clean build installDist
$ sh ./server/build/install/server/bin/bar-server
```

### FAQ
- If you are using an Apple M1, check this [link](https://github.com/grpc/grpc-java/issues/7690) out:

### Contributors
- jorge.cabrera@lemon.me

