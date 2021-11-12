using System.Collections.Generic;

namespace CS426.analysis
{
    public abstract class Definition
    {
        public string name;

        public string toString()
        {
            return name;
        }
    }

    public abstract class TypeDefinition : Definition { }

    public class NumberDefinition : TypeDefinition { }

    public class IntDefinition : TypeDefinition { }

    public class FloatDefinition : TypeDefinition { }

    public class StringDefinition : TypeDefinition { }

    public class BooleanDefinition : TypeDefinition {  }

    public class VariableDefinition : Definition
    {
        // Probably needs something to keep track of the type
        public TypeDefinition variableType;
        public TypeDefinition constantType;
    }

    

    public class FunctionDefinition : Definition
    {
        // Probably needs something to keep track of parameters
        public List<VariableDefinition> parameters;
    }

}

