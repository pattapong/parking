docker rm -f freeparking || true
docker run -d --name freeparking -p 9080:9080 freeparking