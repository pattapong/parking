FROM websphere-liberty
COPY /target/rest-0.0.1.war /opt/ibm/wlp/usr/servers/defaultServer/apps/rest.war
COPY server.xml /opt/ibm/wlp/usr/servers/defaultServer/server.xml
EXPOSE 9080
ENV LICENSE accept
USER root