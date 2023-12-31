SRC_DIR := com/example
OUT_DIR := classes
MAIN_CLASS = com.example.Main

# Find all Java source files recursively
JAVA_FILES := $(shell find $(SRC_DIR) -name "*.java")

# Create the target directory if it doesn't exist
$(shell mkdir -p $(OUT_DIR))

# Define the target to compile Java files
compile: $(JAVA_FILES)
	@javac -d $(OUT_DIR) $^

run: compile
	@cd $(OUT_DIR) && java $(MAIN_CLASS)

# Define a clean target to remove the compiled files
clean:
	rm -rf $(OUT_DIR)

# Define a phony target to prevent conflicts with file named "compile"
.PHONY: compile clean