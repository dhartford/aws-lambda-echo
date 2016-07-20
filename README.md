# aws-lambda-echo

This is an example of a raw network stream AWS Lambda handler.  

Unfortunately, how to set this up to be useful within AWS is the current challenge - there are no direct triggers for accepting a payload from a socket to pass to the AWS Lambda and respond back.  AWS Kinesis somewhat supports reading a stream, but doesn't appear to support the response portion.  AWS ELB only works with EC2 instances.  An SNS queue requires more setup to handle the response back to a TCP response.

Only potential idea left is to create a small ec2 instance and evaluate socket-activation technique to Invoke the AWS lambda via socket-activation code (then you can use ELB in front of the EC2).
