DESCRIPTION = "Memory-mapped sensor userspace application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b1d2c5611fa473ea97aadf83d3f6f12"

SRC_URI = "git://github.com/straxy/qt6-sens-app.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit qt6-cmake

DEPENDS += " qtbase qtdeclarative qtdeclarative-native "
RDEPENDS:${PN} += " qtcharts-qmlplugins ttf-dejavu-sans "
