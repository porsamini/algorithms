FROM java:openjdk-8

ENV app_dir /opt/app
WORKDIR ${app_dir}
ADD . $foo
RUN mkdir $app_dir/out/ && find $app_dir/src/algorithms/ -name "*.java" -exec javac -d $app_dir/out/ {} +
RUN mv $app_dir/alg.sh /root/alg.sh && chmod +x /root/alg.sh
RUN echo "alias alg='/root/alg.sh'" >> /root/.bashrc
