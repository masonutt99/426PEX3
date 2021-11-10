/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import java.util.*;
import org.sablecc.sablecc.xss2.analysis.*;

public final class AArg extends PArg
{
    private TIdentifier _var_;
    private PExpr _expr_;

    public AArg ()
    {
    }

    public AArg (
            TIdentifier _var_,
            PExpr _expr_
    )
    {
        setVar (_var_);
        setExpr (_expr_);
    }

    public Object clone()
    {
        return new AArg (
            (TIdentifier)cloneNode (_var_),
            (PExpr)cloneNode (_expr_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArg(this);
    }

    public TIdentifier getVar ()
    {
        return _var_;
    }

    public void setVar (TIdentifier node)
    {
        if(_var_ != null)
        {
            _var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _var_ = node;
    }
    public PExpr getExpr ()
    {
        return _expr_;
    }

    public void setExpr (PExpr node)
    {
        if(_expr_ != null)
        {
            _expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_var_)
            + toString (_expr_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _var_ == child )
        {
            _var_ = null;
            return;
        }
        if ( _expr_ == child )
        {
            _expr_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _var_ == oldChild )
        {
            setVar ((TIdentifier) newChild);
            return;
        }
        if ( _expr_ == oldChild )
        {
            setExpr ((PExpr) newChild);
            return;
        }
    }

}