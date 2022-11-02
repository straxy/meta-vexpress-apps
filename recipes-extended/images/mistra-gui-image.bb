require recipes-graphics/images/core-image-x11.bb

IMAGE_INSTALL += "kernel-module-mmsens-drv"

IMAGE_INSTALL += "\
    qt6-sens-app \
"
