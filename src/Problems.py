import importlib

# List of module names


problems = 4


# Iterate over module names
for i in range(1, problems + 1):
    # Import the module dynamically
    module = importlib.import_module("problems.Problem" + str(i))

    # Get the class object from the module
    class_obj = getattr(module, "Problem" + str(i))

    # Create an instance of the class
    instance = class_obj()

    # Call the solve function
    answer = instance.solve()

    # Print answer
    print("Problem " + str(i) + " answer: " + str(answer))

