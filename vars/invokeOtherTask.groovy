def call(Map config = [:]){
    build job: "${config.currentJobName}", wait: false, parameters: [
        string(name: 'channel', value: "${config.channel}"),
        string(name: 'buildtype', value: "${config.buildtype}"),
        string(name: 'auto_trigger', value: "${config.auto_trigger}"),
        string(name: 'sdk_env', value: "${config.sdk_env}"),
        string(name: 'u8_enable', value: "${config.u8_enable}"),
        string(name: 'version_env', value: "${config.version_env}"),
        string(name: 'regenerate', value: "${config.regenerate}"),
        string(name: 'final_upload', value: "1"),
        string(name: 'origin_package', value: "${config.origin_package}"),
        ]
}
