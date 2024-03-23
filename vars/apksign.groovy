def call(Map config = [:]){
    dir("${config.apksigner_path}")
    {
        if("${config.channel}".contains('googleplay'))
        {
            sh(script: "${config.apksigner_path}/apksigner sign --ks ${config.projectpath}/Build/exports/keystores/elrond_oversea.keystore --ks-key-alias elrond --v1-signing-enabled true --v2-signing-enabled true --ks-pass pass:Rotk20161213 --key-pass pass:4gnu\\\$22*da8mfj\\&8 --min-sdk-version 24 ${config.projectpath}/Build/outputs/${config.normalFileName}.aab")

            sh(script: "${config.apksigner_path}/apksigner sign --ks ${projectpath}/Build/exports/keystores/elrond_oversea.keystore --ks-key-alias elrond --v1-signing-enabled true --v2-signing-enabled true --ks-pass pass:Rotk20161213 --key-pass pass:4gnu\\\$22*da8mfj\\&8 --min-sdk-version 24 ${config.projectpath}/Build/outputs/${config.normalFileName}.apk")
        }
        else
        {
            sh(script: "${config.apksigner_path}/apksigner sign --ks ${config.projectpath}/Build/exports/keystores/elrond.keystore --ks-key-alias elrond --v1-signing-enabled true --v2-signing-enabled true --ks-pass pass:Rotk20161213 --key-pass pass:8^78%YATCJjMXGvp --min-sdk-version 24 ${config.projectpath}/Build/outputs/${config.normalFileName}.apk")
        }

        sh(script: """find ${config.projectpath}/Build/outputs -type f -name "*.idsig" -delete""", returnStdout: true)
    }
}
