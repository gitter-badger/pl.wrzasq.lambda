/*
 * This file is part of the ChillDev-Lambda.
 *
 * @license http://mit-license.org/ The MIT license
 * @copyright 2018 © by Rafał Wrzeszcz - Wrzasq.pl.
 */

package pl.chilldev.lambda.edgedeploy.model;

import com.amazonaws.services.lambda.model.Runtime;
import com.amazonaws.services.lambda.model.TracingMode;
import lombok.Data;

/**
 * Lambda@Edge deploy CloudFormation request.
 */
@Data
public class EdgeDeployRequest
{
    /**
     * Lambda configuration filename.
     */
    private static final String DEFAULT_CONFIG_FILE = "config.json";

    /**
     * Lambda function name.
     */
    private String functionName;

    /**
     * Lambda function description.
     */
    private String functionDescription;

    /**
     * ARN of Lambda execution role.
     */
    private String roleArn;

    /**
     * Runtime for running the Lambda (note that Lambda@Edge can only handle Node.js).
     */
    private Runtime runtime = Runtime.Nodejs810;

    /**
     * Lambda entry point.
     */
    private String handler;

    /**
     * Memory size (in MB) for the Lambda.
     */
    private int memory;

    /**
     * Lambda timeout (in seconds).
     */
    private int timeout;

    /**
     * Lambda X-Ray tracing mode.
     */
    private TracingMode tracingMode = TracingMode.PassThrough;

    /**
     * Package S3 bucket.
     */
    private String packageBucket;

    /**
     * Package S3 key.
     */
    private String packageKey;

    /**
     * Filename for the injected configuration.
     */
    private String configFile = EdgeDeployRequest.DEFAULT_CONFIG_FILE;

    /**
     * Custom configuration to bundle with the package.
     */
    private Object config;
}
