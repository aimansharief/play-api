FROM sunbird/openjdk-java11-alpine:latest
WORKDIR /home
RUN apk update \
    && apk add unzip \
    && mkdir -p /home
COPY ./target/play-api-1.0.0-dist.zip /home
RUN unzip /home/play-api-1.0.0-dist.zip -d /home
RUN rm /home/play-api-1.0.0-dist.zip
CMD java -cp '/home/play-api-1.0.0/lib/*' -Dplay.http.secret.key='QCY?tAnfk?aZ?iwrNwnxIlR6CTf:G3gf:90Latabg@5241AB`R5W:1uDFN];Ik@n' play.core.server.ProdServerStart  /home/play-api-1.0.0