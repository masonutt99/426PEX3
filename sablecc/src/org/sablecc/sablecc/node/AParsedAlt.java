/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import java.util.*;
import org.sablecc.sablecc.analysis.*;

public final class AParsedAlt extends PAlt
{
    private TId _alt_name_;
    private final LinkedList _elems_ = new TypedLinkedList(new Elems_Cast());
    private PAltTransform _alt_transform_;

    public AParsedAlt ()
    {
    }

    public AParsedAlt (
            TId _alt_name_,
            List _elems_,
            PAltTransform _alt_transform_
    )
    {
        setAltName (_alt_name_);
        this._elems_.clear();
        this._elems_.addAll(_elems_);
        setAltTransform (_alt_transform_);
    }

    public Object clone()
    {
        return new AParsedAlt (
            (TId)cloneNode (_alt_name_),
            cloneList (_elems_),
            (PAltTransform)cloneNode (_alt_transform_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParsedAlt(this);
    }

    public TId getAltName ()
    {
        return _alt_name_;
    }

    public void setAltName (TId node)
    {
        if(_alt_name_ != null)
        {
            _alt_name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _alt_name_ = node;
    }
    public LinkedList getElems ()
    {
        return _elems_;
    }

    public void setElems (List list)
    {
        _elems_.clear();
        _elems_.addAll(list);
    }
    public PAltTransform getAltTransform ()
    {
        return _alt_transform_;
    }

    public void setAltTransform (PAltTransform node)
    {
        if(_alt_transform_ != null)
        {
            _alt_transform_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _alt_transform_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_alt_name_)
            + toString (_elems_)
            + toString (_alt_transform_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _alt_name_ == child )
        {
            _alt_name_ = null;
            return;
        }
        if ( _elems_.remove(child))
        {
            return;
        }
        if ( _alt_transform_ == child )
        {
            _alt_transform_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _alt_name_ == oldChild )
        {
            setAltName ((TId) newChild);
            return;
        }
        for(ListIterator i = _elems_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }
        if ( _alt_transform_ == oldChild )
        {
            setAltTransform ((PAltTransform) newChild);
            return;
        }
    }

    private class Elems_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PElem node = (PElem) o;

            if((node.parent() != null) &&
                (node.parent() != AParsedAlt.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AParsedAlt.this))
            {
                node.parent(AParsedAlt.this);
            }

            return node;
        }
    }
}
