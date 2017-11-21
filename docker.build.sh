#!/usr/bin/env bash

mvn clean package
docker build -t abderrazak/book-search-api .
#docker push abderrazak/book-search-api

