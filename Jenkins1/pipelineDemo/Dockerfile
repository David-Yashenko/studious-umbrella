FROM python:3-alpine3.12

WORKDIR /app

COPY *.txt .

RUN install pip3 -r requirments.txt

COPY movies.py .

EXPOSE 80

CMD python movies.py