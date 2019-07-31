FROM alpine:3.6
RUN apk -v --update add \
        python \
        py-pip \
        groff \
        less \
        mailcap \
        jq \
        && \
    pip install --upgrade awscli==1.16.76 s3cmd==2.0.1 python-magic && \
    apk -v --purge del py-pip && \
    rm /var/cache/apk/*
VOLUME /root/.aws

WORKDIR /usr/pearson/qglobal

ENTRYPOINT ["aws"]