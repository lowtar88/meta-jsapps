SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#
# compile and build will be done in ${S}
# ${WORKDIR} is normally ./tmp/work/aarch64-poky-linux/jsapps/0.1-r0/
#
S = "${WORKDIR}/mybuild"

#
# relative path: ./recipe-xxxx/files/helloworld.c
#
SRC_URI = "file://helloworld.tar.bz2"

do_compile() {
   ${CC} helloworld.c -o helloworld
}

do_install() {
   install -d ${D}${bindir}
   install -m 0755 helloworld ${D}${bindir}
}
