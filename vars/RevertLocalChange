def call(Map config = [:]){
    sh """
    ${config.precommand}/Assets/... >/dev/null
    ${config.precommand}/Packages/... >/dev/null
    ${config.precommand}/Build/exports/... >/dev/null
    ${config.precommand}/Build/ios/... >/dev/null
    ${config.p4_command} -c ${config.p4workspace} revert -w //... >/dev/null"""
}
