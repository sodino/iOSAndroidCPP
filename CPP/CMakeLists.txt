SET(COMMON_CPP_DIR
        ${CMAKE_CURRENT_SOURCE_DIR}/../../../../../CPP)
file(GLOB
    COMMON_CPP_SOURCES 
        ${COMMON_CPP_DIR}/"*.h"
        ${COMMON_CPP_DIR}/"*.cpp"
        ${COMMON_CPP_DIR}/"myMath/*.h"
        ${COMMON_CPP_DIR}/"myMath/*.cpp"

    )
message(WARNING "COMMON_CPP_DIR : " ${COMMON_CPP_DIR})
message(WARNING "currentCurrentSourceDir : " ${CMAKE_CURRENT_SOURCE_DIR})
message(WARNING "currentSourceDir : " ${CMAKE_SOURCE_DIR})
message(WARNING  "TestDemo 1234 " ${COMMON_CPP_SOURCES})